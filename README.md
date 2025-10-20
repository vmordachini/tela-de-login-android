# Tela de Login Simples para Android

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) ![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white) ![XML](https://img.shields.io/badge/XML-gray?style=for-the-badge&logo=android&logoColor=white)

Aplicação Android básica que demonstra a implementação de uma tela de login funcional utilizando Kotlin e o sistema de Views tradicional (XML).

---

## 🚀 Visão Geral das Funcionalidades

* **Interface de Login:** Apresenta campos para entrada de nome de usuário (ou e-mail) e senha, além de um botão para "Entrar".
* **Validação de Entrada:**
    * Verifica se os campos de usuário e senha não estão vazios.
    * Valida se o formato do e-mail inserido no campo de usuário é válido.
    * Verifica se a senha possui um tamanho mínimo (pelo menos 6 caracteres).
* **Feedback ao Usuário:** Exibe mensagens de erro claras caso as validações falhem ou as credenciais estejam incorretas.
* **Autenticação (Simulada):** Compara as credenciais inseridas com valores fixos (`teste@teste.com` / `123456`) para simular o processo de login.
* **Navegação:** Em caso de login bem-sucedido, navega para uma segunda tela (`HomeActivity`) que exibe uma mensagem de boas-vindas.
* **Link "Esqueci a senha":** Inclui um link textual que, ao ser clicado, exibe uma mensagem temporária (Toast) indicando que a funcionalidade será implementada futuramente.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** **Kotlin** - Linguagem oficial para desenvolvimento Android.
* **Interface do Usuário (UI):** **Android Views (XML)** - Sistema tradicional de construção de layouts.
    * **ConstraintLayout:** Utilizado para posicionar os elementos da tela de forma flexível.
    * **Componentes:** `TextView`, `EditText`, `Button`.
* **Bibliotecas Android:**
    * **AppCompat:** Para garantir compatibilidade com versões mais antigas do Android.
    * **Material Components:** Para aplicar o design visual do Material Design.
* **Build System:** **Gradle**.

---

## 🏃‍♀️ Como Rodar a Aplicação

1.  **Pré-requisitos:**
    * [Android Studio](https://developer.android.com/studio) instalado e configurado.
    * Um Emulador Android configurado ou um dispositivo físico com o modo de desenvolvedor ativado.

2.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/vmordachini/tela-de-login-android.git](https://github.com/vmordachini/tela-de-login-android.git)
    cd tela-de-login-android
    ```

3.  **Abra o projeto no Android Studio:**
    * No Android Studio, selecione "Open" (Abrir).
    * Navegue até a pasta onde você clonou o repositório e selecione-a.
    * Aguarde o Gradle sincronizar e construir o projeto.

4.  **Execute a aplicação:**
    * Selecione um dispositivo (emulador ou físico) na barra de ferramentas.
    * Clique no botão "Run 'app'" (ícone de play verde) para compilar e instalar o aplicativo no dispositivo selecionado.
    * Use as credenciais `teste@teste.com` e `123456` para logar.
