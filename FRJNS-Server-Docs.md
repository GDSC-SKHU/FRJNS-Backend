# Project: FRJNS

## End-point: 유튜브 URL 요청
### Method: GET
>```
>https://frjns.ddns.net/api/videos?page=0
>```
### Query Params

|Param|value|
|---|---|
|page|0|
|size|5|


### Response: 200
```json
{
    "content": [
        {
            "id": 1,
            "title": "[릴레이댄스] NewJeans(뉴진스) - Hype Boy (4K)",
            "url": "https://www.youtube.com/watch?v=NcJo-T5Wo3U"
        },
        {
            "id": 2,
            "title": "[릴레이댄스] NewJeans(뉴진스) - Attention (4K)",
            "url": "https://www.youtube.com/watch?v=LjNKUy4hr5c"
        },
        {
            "id": 3,
            "title": "[K-Fancam] 뉴진스 민지 직캠 'Ditto' (NewJeans MINJI Fancam) l @MusicBank 230120",
            "url": "https://www.youtube.com/watch?v=5SReczGhpu4"
        },
        {
            "id": 4,
            "title": "[MPD직캠] 뉴진스 해린 직캠 4K 'Hype Boy' (NewJeans HAERIN FanCam) | @MCOUNTDOWN_2022.8.4",
            "url": "https://www.youtube.com/watch?v=zbyet4HK4ko"
        },
        {
            "id": 5,
            "title": "[K-Fancam] 뉴진스 민지 직캠 'Hype boy' (NewJeans MINJI Fancam) l @MusicBank 220812",
            "url": "https://www.youtube.com/watch?v=3rxsX-iFZio"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "unsorted": true,
            "sorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 5,
        "paged": true,
        "unpaged": false
    },
    "size": 5,
    "number": 0,
    "sort": {
        "empty": true,
        "unsorted": true,
        "sorted": false
    },
    "first": true,
    "numberOfElements": 5,
    "last": false,
    "empty": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 뉴진스 정보(스케줄) 요청
### Method: GET
>```
>https://frjns.ddns.net/api/news
>```
### Query Params

|Param|value|
|---|---|
|page|0|
|size|5|


### Response: 200
```json
{
    "content": [
        {
            "id": 1,
            "startDate": "2023-01-01",
            "endDate": "2023-01-01",
            "detail": "Ditto Dance Practice"
        },
        {
            "id": 2,
            "startDate": "2023-01-02",
            "endDate": "2023-01-02",
            "detail": "OMG 음반 발매"
        },
        {
            "id": 3,
            "startDate": "2023-01-02",
            "endDate": "2023-01-02",
            "detail": "OMG COUNTDOWN LIVE"
        },
        {
            "id": 4,
            "startDate": "2023-01-02",
            "endDate": "2023-01-02",
            "detail": "OMG MV 공개"
        },
        {
            "id": 5,
            "startDate": "2023-01-02",
            "endDate": "2023-01-02",
            "detail": "침착맨"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "unsorted": true,
            "sorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 5,
        "paged": true,
        "unpaged": false
    },
    "size": 5,
    "number": 0,
    "sort": {
        "empty": true,
        "unsorted": true,
        "sorted": false
    },
    "first": true,
    "numberOfElements": 5,
    "last": false,
    "empty": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: MBTI에 맞는 뉴진스 멤버 요청
### Method: GET
>```
>https://frjns.ddns.net/api/mbti/{mbti}
>```
### Response: 200
```json
[
    {
        "sourceMbti": "ISTP",
        "targetName": "민지(ESTJ)",
        "imageUrl": "https://lh3.googleusercontent.com/JQbT6YxShn078Zch5Er1YHci8EFgFacup40quXF6nhlN0jto2vM3w0cvMzKhttdDd3_O_bWI3Gvv17VN2DhFFKTmUPHOwUvJeew-5l_-laDtqQ=w960-rj-nu-e365",
        "content": "관리자 스타일이며 리더에 적합한 민지와 궁합이 좋군요! 가끔 그녀가 잔소리를 해도 그것은 그녀의 애정표현일 뿐! 오해하지 않기~"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
