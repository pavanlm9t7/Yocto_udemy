require recipes-core/images/core-image-base.bb

SUMMARY = "meta-perl build test image"

IMAGE_INSTALL += "packagegroup-meta-perl packagegroup-meta-perl-extended"
