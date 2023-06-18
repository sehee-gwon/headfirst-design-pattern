## 헤드퍼스트 디자인 패턴
### Chapter 00. 들어가며
### Chapter 01. 디자인 패턴 소개와 전략 패턴
분류: 행동 패턴

**디자인 패턴**
- 전략 패턴

**디자인 원칙**
- 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다.
- 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
- 상속보다 구성 (Composition) 을 활용한다.

### Chapter 02. 옵저버 패턴
분류: 행동 패턴

**디자인 패턴**
- 옵저버 패턴

**디자인 원칙**
- 느슨한 결합 (Loose Coupling)
- 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.

### Chapter 03. 데코레이터 패턴
분류: 구조 패턴

**디자인 패턴**
- 데코레이터 패턴

**디자인 원칙**
- 개방 폐쇄 원칙 (Open-Closed Principle)
- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 한다.

### Chapter 04. 팩토리 패턴
분류: 생성 패턴

**디자인 패턴**
- 팩토리 메소드 패턴
  - 상속을 통한 클래스 확장으로 구현한다.
  - 제품이 추가되면 서브 클래스를 만들어야 하므로, 클래스의 수가 늘어나는 단점이 있다.
- 추상 팩토리 패턴
  - 구성을 통한 인스턴스 전달로 구현한다.
  - 제품이 추가되면 메소드를 추가해야 하므로, 인터페이스를 수정해야 하는 단점이 있다.

**디자인 원칙**
- 의존 역전 원칙 (Dependency Inversion Principle)
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.

### Chapter 06. 커맨드 패턴
분류: 행동 패턴

**디자인 패턴**
- 커맨드 패턴
  - 요청하는 객체와 요청을 수행하는 객체를 분리하는 패턴이다.
  - 이 패턴을 활용하여 실행 취소, 로그, 트랜잭션 시스템을 구현할 수 있다.
  - 매크로 커맨드는 여러 개의 커맨드를 묶어 놓은 커맨드이다.
  - client, invoke, command, receiver 로 이뤄진다.
    - client = 고객, invoke = 종업원, command = 주문서, receiver = 요리사
    - receiver 의 행동 메소드를 커맨드 객체로 캡슐화 할 수 있다.
    - client 는 invoke 를 실행시키고, invoke 는 command 를 통해 최종적으로 receiver 의 행동을 호출한다.
    - invoke, command, receiver 는 분리되어 있어 서로 어떤 일을 하는지 모른다.
  
### Chapter 07. 어댑터 패턴과 퍼사드 패턴
분류: 구조 패턴  

**디자인 패턴**
- 어댑터 패턴
  - 특정 인터페이스를 사용할 수 없을 때, 사용 가능한 다른 인터페이스로 변환해주는 패턴이다.
  - client, target interface, adapter, adaptee 로 이뤄진다.
    - target interface = Duck, adapter = TurkeyAdapter, adaptee = Turkey
    - adapter 는 target interface 의 메소드 호출을 가로채서 adaptee 의 메소드를 호출하도록 해준다.
  - 객체 어댑터와 클래스 어댑터 두 종류로 나뉜다.
    - 객체 어댑터: adaptee 를 적용할 때 구성을 사용한다.
    - 클래스 어댑터: adaptee 를 적용할 때 상속을 사용한다. (adapter 에서 target interface, adaptee 둘 다 상속받음)

- 퍼사드 패턴
  - 서브 시스템에 속한 일련의 복잡한 인터페이스를 통합 인터페이스로 묶어 단순하게 만드는 패턴이다.
  - client, facade 로 이뤄진다.
    - facade = HomeTheaterFacade

**디자인 원칙**
- 최소 지식 원칙 (Principle of Least Knowledge) = 데메테르의 법칙
- 객체 사이의 상호작용은 아주 가까운 '친구' 사이에서만 허용한다.
  - 객체 자체
  - 매개변수로 전달된 객체
  - 직접 생성하거나 인스턴스를 만든 객체
  - 객체에 속하는 구성 요소

### Chapter 09. 반복자 패턴과 컴포지트 패턴
분류: 구조/행동 패턴

**디자인 패턴**
- 반복자 패턴
  - 컬렉션의 구현 방법을 노출하지 않으면서, 내부에 접근하는 방법을 제공해주는 패턴이다.
  - 자바의 Iterator 인터페이스는 이 패턴을 사용하였다.
  - client, aggregate, iterator 로 이뤄진다.
    - client = Waitress, aggregate = Menu, iterator = Iterator

- 컴포지트 패턴
  - 객체를 트리 구조로 구성해서 부분-전체 계층 구조를 구현한다. 재귀적인 구조의 패턴이다.
  - 클라이언트에서 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있다.
  - client, component, leaf, composite 로 이뤄진다.
    - client = Waitress, component = MenuComponent, leaf = MenuItem, composite = Menu
    - leaf 는 구성 요소를 포함하지 않는 객체이며, composite 는 다른 구성 요소를 포함하는 객체이다.

**디자인 원칙**
- 단일 책임 원칙 (Single Responsibility Principle)
- 하나의 객체는 하나의 역할만 맡아야 한다.