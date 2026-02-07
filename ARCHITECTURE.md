# Architektura - java-ac4y-g8h-object-service

## Attekintes

Az objektum szolgaltatas reteg kerest/valasz (request/response) DTO-kat biztosit a G8H GUID-HumanId muveletek szamara.

## Szerkezet

```
src/main/java/ac4y/guid8humanid/service/object/
  Ac4yGUID8HumanIdObjectService.java - Fo szolgaltatas osztaly
  common/
    Ac4yG8HResponse.java             - G8H valasz alap osztaly
    ByGUIDRequest.java               - GUID alapu keres alap
    ByHumanIdRequest.java            - HumanId alapu keres alap
    ByHumanIdsRequest.java           - Template+HumanId keres alap
    ByPersistentIdRequest.java       - PersistentId alapu keres alap
    BySeparateHumanIdsRequest.java   - Kulon HumanId-k keres
    ByTemplateRequest.java           - Template alapu keres alap
    GUIDResponse.java                - GUID valasz alap
    HumanIds.java                    - HumanId par wrapper
    PersistentIdResponse.java        - PersistentId valasz alap
  get/
    Get*Request.java / Get*Response.java - Lekerdezesi muveletek DTO-i
    IsExist*Request.java / IsExist*Response.java - Letezik-e ellenorzesek DTO-i
  set/
    Set*Request.java / Set*Response.java - Beallitasi muveletek DTO-i
```

## Osztalyok

### Ac4yGUID8HumanIdObjectService
- Minden muvelet request/response mintat kovet
- Hibakezelest es logolast biztosit
- `Ac4yGUID8HumanIdService`-t hiv belsoen

### common/ - Kozos DTO alap osztalyok
- Az algebra minta alapjan epulnek (alap osztalybol szarmaztatott request/response-ok)

### get/ - Lekerdezesi muveletek (14 request/response par)
### set/ - Beallitasi muveletek (2 request/response par)

## Fuggetlensegek

- ac4y-g8h-basic (Ac4yGUID8HumanIdService)
- ac4y-base4jsonandxml (JSON/XML sorositas)
- ac4y-service-domain (Ac4yProcessResult)

## Eredet

Az `IJAc4yG8HModule/ObjectService` modulbol kinyerve.
