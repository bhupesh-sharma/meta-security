SUMMARY = "fscrypt is a high-level tool for the management of Linux filesystem encryption"
DESCIPTION = "fscrypt manages metadata, key generation, key wrapping, PAM integration, \
and provides a uniform interface for creating and modifying encrypted directories. For \
a small low-level tool that directly sets policies, see fscryptctl \
(https://github.com/google/fscryptcl)."
HOMEPAGE = "https://github.com/google/fscrypt"
SECTION = "base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "92b1e9a8670ccd3916a7d24a06cab1e4c9815bc4"
SRC_URI = "git://github.com/google/fscrypt.git"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=/usr install
}

DEPENDS += "go-dep-native"
