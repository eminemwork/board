# 게시판

## 데이터베이스
- 모든 설계는 디시인사이드를 따라간다
- 대분류, 소분류
- 대분류: 게임, 연예인, 방송, 취미, 해외방송, 음식, 음악, 만화/애니, 스포츠, 건, 생물, 금융/제테크, 대학, 디지털
- 소문류: 각 분류에 해당되는 게시판
- 게시판: 글, 작성자, 댓글
- 회원: 등급, 권한, 포인트, 랭킹

개발 순서
- 글을 쓸 수 있는 게시판 1개
- Oauth 로그인
    - 개인정보 페이지
    - 포인트제도, 랭킹, 등급
- 여러 개의 게시판
    - 글 쓰기 삭제 수정
    - 댓글 대댓글
    - 사진첨부, 동영상 첨부, 파일 첨부 등
    - 보안 생각
    - 게시판 추가 기능(대분류, 소분류)
    - 신고 기능
    - 추천 기능
    - 개념
- admin 페이지
    - 게시판 추가 허락
    - 운영진 임명
    - 회원관리
- 모바일 지원

## 기술스택
- Spring boot, Gradle
- mysql(docker)


<details>
<summary>변경 사항</summary>
1. spring boot devtools - live reload 적용
</details>

<details>
<summary>궁금증</summary>
1. gradle 은 어떻게 동작하는가 (configuration compile, development option)

</details>