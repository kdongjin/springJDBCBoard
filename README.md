📝 JDBC 기반 게시판 데이터베이스 설계 (Oracle)이 저장소는 Java와 Database를 연동하는 JDBC 학습 및 실습을 위한 Oracle SQL 스크립트를 담고 있습니다. 시니어 개발자 및 입문자분들이 DB 구조를 한눈에 파악하고 즉시 실습에 활용할 수 있도록 구성되었습니다.🚀 주요 기능 및 구성계정 관리: KHH 사용자 계정 생성 및 권한 부여데이터 구조: 게시판 정보를 담는 jdbcBoard 테이블 설계자동 번호 생성: Sequence를 이용한 게시글 번호 자동 증가CRUD 작업: 데이터 입력(Insert), 조회(Select), 수정(Update), 삭제(Delete) 기능검색 최적화: 제목, 작성자, 내용별 조건 검색 쿼리 포함🛠 SQL 스크립트 가이드1. 사용자 계정 생성 및 환경 설정시스템 권한으로 접속하여 실습용 계정을 생성하고 권한을 부여합니다.SQLALTER SESSION SET "_ORACLE_SCRIPT"=true;
DROP USER KHH CASCADE; 
CREATE USER KHH IDENTIFIED BY KHH
    DEFAULT TABLESPACE USERS
    TEMPORARY TABLESPACE TEMP; 
GRANT CONNECT, RESOURCE, DBA TO KHH; 
2. 테이블 및 시퀀스 생성게시판의 핵심 정보를 저장할 테이블과 기본 키(no)를 위한 시퀀스를 생성합니다.Table Name: jdbcBoardColumns: no(PK), title, content, writer, regdateSQLCREATE TABLE jdbcBoard( 
    no NUMBER PRIMARY KEY, 
    title VARCHAR2(100) NOT NULL, 
    content VARCHAR2(1000), 
    writer VARCHAR2(50) NOT NULL, 
    regdate DATE DEFAULT SYSDATE
);

CREATE SEQUENCE jdbcBoard_seq START WITH 1 INCREMENT BY 1;
3. 주요 쿼리문 (DML)실제 애플리케이션에서 활용되는 CRUD 쿼리 예시입니다.기능쿼리 설명등록INSERT INTO jdbcBoard VALUES (jdbcBoard_seq.nextval, ...)목록 조회최신글 순으로 정렬하여 전체 리스트를 반환합니다.상세 보기특정 번호(no)의 게시글을 상세 조회합니다.수정제목, 내용, 작성자 정보를 업데이트합니다.삭제특정 번호의 게시글을 삭제합니다.🔍 검색 타입 예시다양한 조건에 맞춰 데이터를 검색할 수 있는 쿼리 패턴입니다.제목 검색: WHERE title LIKE '%검색어%'작성자 검색: WHERE writer LIKE '%검색어%'내용 검색: WHERE content LIKE '%검색어%'
