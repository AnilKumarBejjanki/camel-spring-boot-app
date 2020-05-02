<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">

		<esb:getAddressResponse
			xmlns:esb="http://esb.training.com/esb_adapter">
			<AddressOne>AddressTwoResponse_two</AddressOne>
		</esb:getAddressResponse>

	</xsl:template>
	<xsl:output indent="yes" />
</xsl:stylesheet>