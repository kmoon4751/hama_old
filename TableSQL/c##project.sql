/* system�������� �����Ѵ�.    */
/* Oracle 12c �̻��� CDB ����� ������ ���� c##�� ���δ�    */
DROP USER c##project CASCADE;
CREATE USER c##project IDENTIFIED BY project1234 DEFAULT TABLESPACE users TEMPORARY TABLESPACE temp PROFILE DEFAULT;
GRANT CONNECT, RESOURCE TO c##project;
GRANT CREATE VIEW, CREATE SYNONYM TO c##project;
GRANT UNLIMITED TABLESPACE TO c##project;
ALTER USER c##project ACCOUNT UNLOCK;