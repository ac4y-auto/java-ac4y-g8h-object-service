# java-ac4y-g8h-object-service

Object service layer with request/response DTOs for G8H GUID-to-HumanId operations.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-g8h-object-service`
- **Version**: `1.0.0`

## Description

This library provides the object-oriented service interface for the G8H system. It wraps `Ac4yGUID8HumanIdService` operations with typed request/response objects for get, set, and existence check operations.

### Operations

- **Set**: `setByHumanIds`, `setTemplateByHumanId`
- **Get**: `getByGUID`, `getByHumanIds`, `getByPersistentId`, `getGUIDByHumanIds`, `getTemplateGUID`, `getList`, `getInstanceList`, `getGUIDList`, `getPersistentIdByHumanIds`
- **Exists**: `isExistByGUID`, `isExistByHumanIds`, `isExistByPersistentId`

## Dependencies

- `ac4y-g8h-basic` (core service and domain)
- `ac4y-base4jsonandxml` (JSON/XML serialization)
- `ac4y-service-domain` (Ac4yProcessResult)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJAc4yG8HModule/ObjectService`.
