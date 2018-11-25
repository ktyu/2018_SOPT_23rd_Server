# Pokemon 도감 API

## 도감 등록

| 메소드 | 경로      | 설명        |
| ------ | --------- | ----------- |
| POST   | /pokemons | 포켓몬 등록 |

### 요청 헤더

```json
Content-Type: multipart/form-data
```

### 요청바디

```json
{
    "name" : "망나뇽",
    "type" : "드래곤",
    "photh" : "사진 파일 객체"
}
```

### 응답 바디

**등록 성공**

```json
{
    "status": 201,
    "message": "등록 성공",
    "data": null
}
```

**등록 실패**

```json
{
    "status": 400,
    "message": "등록 실패",
    "data": null
}
```

**DB 에러**

```json
{
    "status": 600,
    "message": "DB 에러",
    "data": null
}
```

