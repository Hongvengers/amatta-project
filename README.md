# port-and-adapter-task-management-project
육각형 아키텍처 연습용 ~~게시판~~ 할일 목록 관리 서비스 토이프로젝트 입니다.



# 도메인 정의

## Event Storming 

### 기준일 2023.07.05
![DomainEvents20230705](https://github.com/Hongvengers/port-and-adapter-task-management-project/assets/66003338/ed97689b-ab3f-4421-b85d-494141acfe17)

크게
사용자, 할일, 할일들을 묶을 수 있는 루틴, 알림
위와 같이 도메인 영역을 잡고 정의를 진행하였다. (계속 추가되어야 함)


### 기준일 2023.07.06
![DomainEventsWithCommand20230706](https://github.com/Hongvengers/port-and-adapter-task-management-project/assets/66003338/c8475853-0b5b-408b-9736-89ec5a90f461)

현재 대략적인 바운디드 컨텍스트는
회원, 할일관리, 알림관리 와같이 크게 3가지로 나눌 수 있으며,
도메인 영역은 회원, 할일, 일정, 루틴, 알림 으로 세분화 할 수 있을 것으로 보인다.
(계속... 계속 추가되어야한다...)

