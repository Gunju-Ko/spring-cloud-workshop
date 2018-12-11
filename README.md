# Spring Cloud Workshop

## How to start

### Repository Clone 받기

```
git clone https://github.com/Gunju-Ko/spring-cloud-workshop.git
```

### 실습 시작 Branch로 이동
```
git checkout my-step-0
```

### 실습을 건너뛰고 막바로 특정 단계에서 시작하기
```
git checkout tags/<tag 이름>
```
혹은
```
git checkout tags/<tag 이름> -b <새로운 브랜치 이름>
```

## 주요 단계별 Tag 설명

- `step-0` : 실습 시작
- `step-1` : RestTemplate을 이용한 서버 호출 실습
- `step-2-hystrix-baseline` : Hystrix 실습 초기 상태
- `step-2-hystrix-basic` : Hystrix 기본 적용
- `step-2-hystrix-fallback` : Hystrix Fallback 적용
- `step-2-hystrix-fallback2` : Hystrix Fallback에서 Throwable 받기
- `step-2-hystrix-tiemout` : Hystrix Timeout 실습
- `step-2-hystrix-circuit-open` : Hystrix Circuit Open 실험
- `step-2-hystrix-command-key` : Hystrix Command 에 command key 부여하기
- `step-3-baseline` : Ribbon 실습 초기 상태
- `step-3-ribbon-loadbalanced` : @LoadBalanced RestTemplate 사용하기
- `step-3-ribbon-retry` : Ribbon retry 설정 및 실험
- `step-4-baseline` : Eureka 실습 초기 상 - Eureka Server 추가되어 있음
- `step-4-eureka-client` : Product, Display 서버에 Eureka Client 추가
- `step-4-eureka-completed` : 불필요한 설정 삭제
- `step-5-baseline` : Feign 실습 초기 상태
- `step-5-feign-url` : URL과 함께 Feign 사용하기
- `step-5-feign-eureka` : Feign을 Eureka + Ribbon과 함께 사용하기
- `step-5-feign-hystrix` : Feign에 Hystrix 적용하기 (Fallback 포함)
- `step-5-feign-fallbackfactory` : FallbackFactory를 이용하여 Fallback 적용
- `step-5-feign-hystrix-properties` : Feign의 Hystrix에 Properties 추가하는 법
- `step-6-zuul-baseline` : Zuul 실습 초기 상태
- `step-6-zuul-proxy-with-eureka` : Eureka를 이용한 Zuul Proxy 사용
- `step-6-zuul-isolation-thread-pool` : ThreadPool을 이용한 Isolation 사용
- `step-6-zuul-ribbon-config` : serviceId별 Ribbon 설정하기
- `step-ended` : 실습 완료