# LifeLogger

- Life Logger Application

## 概要（Overview）

- ライフログ管理のWEBアプリケーション
- 多様なプラットフォームの情報を集約し、１システムで管理できるようにする。

### 作成経緯（Background）

- 自分の一日の行動ログを手入力でつけているが、入力する情報量が多く面倒に感じた。
- IFTTTなどのプラットフォーム連携サービスを一通り試してみるが、集約できることに制限を感じた。
- そこで、スマホを触ったログ、ブラウザ履歴、SNS、ブログ記事投稿情報など、活動履歴を一覧化できるプラットフォームがあればと思い作成を検討。

### 効果/狙い（Purpose）

- ライフログの半自動化
- 振り返り/分析の簡易化
- Web開発スキル向上

## 構成（Constitution）

### スキル（Skills）

- Programing Language / Framework
  - java8(Struts2)
  - javaScript
  - CSS(AdminLTE3 - Bootstrap4)
  - ORM(DOMA2)
- Web container
  - Apache Tomcat
- OS
  - Windows10+ or Linux
- Configuration management
  - Git
- Database
  - postgresql

## タスク（TODO）

### 機能

- [x] ベースフレーム作成
  - [x] Struts2 x Doma2 x PostgreSQL 環境構築
  - [x] AdminLTE3導入
  - [x] Maven管理
- [ ] ログイン画面
  - [x] 入力フォーム バリデート処理
  - [x] 入力フォーム ログイン処理 / セッション管理
  - [ ] パスワードリマインドリンク
  - [ ] 新規登録リンク
  - [ ] Googleアカウントログイン
  - [ ] Facebookアカウントログイン
  - [ ] Recaptcha実装（セキュリティ/bot対策）
- [ ] ホーム画面
  - [x] レイアウト（仮）
  - [ ] 各ページへのリンク
- [ ] 新規登録/更新 画面/機能
- [ ] パスワードリマインド画面/機能
- [ ] ダッシュボード画面/機能
- [ ] ID連携画面/機能
- [ ] タイムライン表示画面/機能
- [ ] etc...

### 構成管理（CI/CD）・その他

- [ ] DJunit
- [ ] Findbug / FindSecuritybugs
- [ ] OWASP ZAP 導入検討
- [ ] ドキュメント作成

## 環境構築（Setup）

### 前提条件（Prerequisites）

- 作成中...

## ドキュメント（Document）

- 作成中...

## デプロイ方法（Deploy）

- 作成中...

## テスト（Test）

- 作成中...

## 課題管理（Ticket）

- 作成中...

## Licence

- MIT Lisence

## Author

- Tomoaki Tsutsui.
