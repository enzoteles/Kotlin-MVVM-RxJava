# Kotlin-MVVM-RxJava

Esse projeto tem como objetivo de mostra uma proposta de arquitetura com MVVM, utilizando a linguagem de programação Kotlin, os frameworks RXJava e Dagger 2 e os componentes de Arquitetura LiveDate, ViewModel e LifecycleOwner. Este projeto tem finalidade de ajudar os desenvolvedores que gostariam de se adaptar com os novos padrões de arquitetura que foi apresentando no Google I/O 2017. Esse projeto tem um objetivo de utilizar uma arquitetura clean onde pode ser baixado para ser utilizado em projetos pessoais e projetos profissionais, onde é fácil de entender e fácil de dar manutenção.

## Arquitetura MVVM

O MVVM é um pattern que foi criado em 2005, por John Gossman, um dos arquitetos do WPF e Silverlight na Microsoft. O MVVM assemelha-se em alguns aspectos o MVC (Model View Controller) e ao MVP (Model View Presenter), podemos até dizer que o MVVM é uma especialização do MVP adaptado para a arquitetura do WPF E Silverlight. Conceitualmente, o MVVM e o MVP são idênticos, o que os diferencia é que o MVVM é específico para a arquitetura do WPF e Silverlight e o MVP é independente de plataforma. 

mai informações no links abaixo:

https://www.devmedia.com.br/entendendo-o-pattern-model-view-viewmodel-mvvm/18411

https://medium.com/upday-devs/android-architecture-patterns-part-3-model-view-viewmodel-e7eeee76b73b

## Kotlin
  
  Kotlin é uma linguagem da JetBrains, famosa por suas IDE's (RubyMine, IntelliJ, PhpStorm, etc), que foi construída para ser usada internamente pela empresa e foi pensada visando melhor legibilidade, produtividade e suprir limitações que a JetBrains vinha enfrentando com Java.
  Kotlin é a nova linguagem de programação que tem dado de falar na actualidade, foi criado pela jetbrains e teve 6 anos de desenvolvimento (2010–2016), pelos anos de desenvolvimento pode se perceber que não é uma linguagem que surge como uma brincadeira, mas sim é algo estável e sério.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/kotlin-primeiros-passos-b9035259e63a
  
  https://medium.com/kotlin-para-android/introdu%C3%A7%C3%A3o-a-kotlin-51a4355f3bc8
  
  http://blog.triadworks.com.br/uma-breve-introducao-a-kotlin
  
  esse link foi onde turbinei meu aprendizagem em kotlin
  
  https://www.youtube.com/watch?time_continue=1&v=FHZ6bI3zb4M
  
  
  ## Dagger 2
  
  O Dagger 2 é um framework mantido pela google que tem por objetivo realizar a injeção de dependência em projetos Android e Java. Ele foi criado a partir do Dagger 1 que foi desenvolvido pela Square.
  Importante ressaltar que o Dagger é para o Java, a Injeção de Dependência é um design pattern de programação, para qualquer linguagem.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/introdu%C3%A7%C3%A3o-ao-dagger-2-56d193118a6c
  
  https://www.thiengo.com.br/injecao-de-dependencia-com-a-lib-dagger-2-no-android
  
  https://www.concrete.com.br/2016/08/17/dagger-2-um-ano-depois/
  
  ## RxJava
  
  Programação Reativa é descrita simplesmente como programação utilizando um fluxo de dados assíncrono. Porém, este não é um novo conceito, outros padrões também utilizam esse significado.
  A RxJava possui características interessantes como facilidade de controlar concorrência, de forma a melhorar o uso do poder de processamento dos seus servidores; facilidade na execução condicional de tarefas assíncronas; melhoria quanto a evitar o problema de uso de vários callbacks (evitar o uso excessivo do padrão Observer) e abordagem reativa.
  
  https://www.devmedia.com.br/programacao-reativa-com-a-biblioteca-rxjava/33651
  
  https://medium.com/@spparks_/rxandroid-introdu%C3%A7%C3%A3o-b%C3%A1sica-primitivos-rxjava-599029ec1595
  
  https://www.infoq.com/br/presentations/programacao-reativa-com-rx
