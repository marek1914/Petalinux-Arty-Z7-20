DESCRIPTION = "PETALINUX image definition for Xilinx boards"
LICENSE = "MIT"

require recipes-core/images/petalinux-image-common.inc 

inherit extrausers
IMAGE_LINGUAS = " "

IMAGE_INSTALL = "\
		kernel-modules \
		mtd-utils \
		canutils \
		openssh-sftp-server \
		bash-completion \
		grep \
		pciutils \
		run-postinsts \
		libstdc++ \
		glib-2.0 \
		ldd \
		packagegroup-core-boot \
		packagegroup-core-buildessential \
		packagegroup-core-ssh-dropbear \
		tcf-agent \
		bridge-utils \
		"
EXTRA_USERS_PARAMS = "usermod -P root root;"
