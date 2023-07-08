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


### 기준일 2023.07.09
![DomainEventsWithCommand20230706](https://github.com/Hongvengers/port-and-adapter-task-management-project/assets/66003338/9b289409-d996-401e-9059-444525bc0c65)

DDD라는 것이 너무 어렵게 느껴졌다.
특히 애그리거트를 정의를하기 시작할때, "이 이벤트는 사용자가 실행하는거니까 사용자 애그리거트구나" 정도로 막연하게 생각했다.
그 결과... 액터를 애그리거트로 정의하는 불상사가 생겨버렸다.
이후, 여러 정보를 찾아보고 수정을 하였으나 애그리거트와 액터가 구분되기는 하였다.
하지만... 현재 서비스되고있는 도메인도 아니고, 머릿속에서 갑자기 꺼낸 아이디어라 복잡도가 높지않아 액터나 애그리거트나 별반 다르지 않은 것으로 보였다.(적어도 지금의 지식 수준에서는)
그래서 이벤트 스토밍만 수 일을 진행하는건 너무 매몰되는 경향이 없잖아 있는 것으로 판단되, Task Management 바운디드 컨텍스트는 이정도로 마무리 하고 할일관리 서비스 정도만 간략히 구현하는게 맞겠다고 판단이 되었다.
