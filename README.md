# Assesment-lawecon-farhan
Submission for QA assessment CASE01 &amp; CASE02 (DemoQA + Swagger Petstore)
# QA Assessment Submission – Lawecon

## 📋 Requirement
Untuk menjalankan project ini, pastikan tools berikut telah terinstal:

- **Katalon Studio v10.0.0 atau lebih baru**
  - Java Runtime Environment v25.0.1 (LTS)
  - Kompatibel dengan Data Files (Excel) dan plugin PDF/XML report
- **Postman v11.77.2**
  - Mendukung Collection & Environment export
  - Assertion melalui tab Tests
- **Spreadsheet viewer/editor**
  - Untuk membuka file XLS test case (`.xlsx`)
- **Browser modern (Chrome/Edge)**
  - Untuk membuka report PDF dan HTML

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
- Test cases: 8 positive + 7 negative
- Reports: json run test

## ▶️ Cara Menjalankan
### Katalon
1. Buka project di Katalon Studio
2. Import Excel dari `testcases/CASE01_demoqa_testcases.xlsx`
3. Jalankan Test Suite
4. Lihat hasil di `katalon/reports/`

### Postman
1. Import Collection dan Environment
2. Jalankan semua request
