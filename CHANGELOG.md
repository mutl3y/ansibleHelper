<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# ansibleHelper Changelog
## [Unreleased]
### Added

### Changed

### Deprecated

### Removed

### Fixed

### Security
## [0.1.0]
### Added
- Modern `ansible.builtin.*` live templates for ansible-core 2.x (FQCN format) covering 25 essential modules
- Support for IntelliJ IDEA 2023.2 through 2025.1

### Changed
- Updated minimum supported IDE version to 2023.2 (build 232)
- Replaced deprecated JavaScript plugin dependency with native `com.intellij.json` extension point
- Migrated build tooling: Gradle 8.9, gradle-intellij-plugin 1.17.4, Kotlin 1.9.25, Java 17
- Removed defunct jcenter() repository in favour of mavenCentral()
- Updated GitHub Actions workflows to use current action versions

## [0.0.6]
### Added
- ansible json schema's for validation
- Added json schema's for Ansible

### Fixed
- changelog updates to published plugin so it can be seen within idea marketplace
- fixed github pipeline issues

## [0.0.5]
### fixed
- updated ansible templates so 2.9 and 2.10 are available

##[0.0.4] 26/01/2021
### changed
- updated Ansible templates

## [0.0.3] 22/01/2021
### Changed
- update changelog

## [0.0.2] 20/01/2021
### Changed
- update plugin icon

## [0.0.1] 20/01/2021
### Added
- Initial release to marketplace including both Ansible 2.9 & 2.10

