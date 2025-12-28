# Assesment-lawecon-farhan
Submission for QA assessment CASE01 &amp; CASE02 (DemoQA + Swagger Petstore)
# QA Assessment Submission – Lawecon

## 📁 Struktur
- `testcases/` → XLS test case design for CASE01 & CASE02
- `katalon/` → Katalon reports (PDF & XML)
- `postman/` → Postman collection, environment, and reports

## 🧪 CASE01 – DemoQA Form
- Tools: Katalon Studio
- Method: Data Driven Test
- Features: Assertions, PDF/XML report
- Test cases: 1 positive + 7 negative

## 🔗 CASE02 – Swagger Petstore API
- Tools: Postman + Newman
- Method: Chaining, Assertions
- Test cases: 7 positive + 8 negative
- Reports: HTML + PDF via Newman

## ▶️ Cara Menjalankan
### Katalon
1. Buka project di Katalon Studio
2. Import Excel dari `testcases/CASE01_demoqa_testcases.xlsx`
3. Jalankan Test Suite
4. Lihat hasil di `katalon/reports/`

### Postman
1. Import Collection dan Environment
2. Jalankan semua request
3. Generate report via Newman:
   ```bash
   newman run postman/collections/SwaggerPetstore_Test.postman_collection.json -e postman/env/SwaggerPetstore_Env.postman_environment.json -r cli,html
