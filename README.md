# MyMultiAppProject

## Overview

MyMultiAppProject is a multi-module Android application that includes two catalog apps: one for Apple products and one for Samsung products. This project demonstrates the use of a common module to share code between different apps and how to structure a multi-module Android project using Java.

## Modules

### 1. `common`
This module contains shared code used by both the Apple and Samsung catalog apps.

#### Key Classes:
- `Product`: Represents a product with attributes like name, image URL, price range, memory range, screen size, weight, battery life, and launch year.
- `ProductAdapter`: A RecyclerView adapter for displaying products.
- `CommonActivity`: An abstract activity that other activities can extend to display a list of products.

### 2. `applecatalogapp`
This module is an Android application for displaying a catalog of Apple products.

#### Key Classes:
- `DataManagerAppleCatalog`: Manages a list of Apple products.
- `Activity_panel`: Extends `Activity_PanelBase` to display Apple products.

### 3. `samsungcatalogapp`
This module is an Android application for displaying a catalog of Samsung products.

#### Key Classes:
- `DataManagerSamsungCatalog`: Manages a list of Samsung products.
- `Activity_panel`: Extends `Activity_PanelBase` to display Samsung products.

## Setup

### Prerequisites
- Android Studio
- Java JDK
- Gradle

#### `Product` Class
Represents a product with the following attributes:
- `name`: Name of the product.
- `imageUrl`: URL of the product image.
- `priceRange`: Price range of the product.
- `memoryRange`: Memory range of the product.
- `screenSize`: Screen size of the product.
- `weight`: Weight of the product.
- `batteryLife`: Battery life of the product.
- `launchYear`: Launch year of the product.

#### `ProductAdapter` Class
RecyclerView adapter for displaying products.

#### `Activity_PanelBase` Class
Abstract activity that provides a template for displaying a list of products.

### Apple Catalog App

#### `DataManagerAppleCatalog` Class
Manages a list of Apple products.

#### `Activity_panel` Class
Extends `Activity_PanelBase` to display Apple products.

### Samsung Catalog App

#### `DataManagerSamsungCatalog` Class
Manages a list of Samsung products.

#### `Activity_panel` Class
Extends `Activity_PanelBase` to display Samsung products.
