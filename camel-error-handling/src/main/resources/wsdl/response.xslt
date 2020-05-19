<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:param name="id" />
	<xsl:param name="line" />
	<xsl:param name="city" />
	<xsl:param name="state" />

	<xsl:template match="/">

		<esb:getAddressResponse
			xmlns:esb="http://esb.training.com/esb_adapter">
			<AddressFromReqeust>
				<xsl:value-of select="esb:getAddressRequest/addressId" />
			</AddressFromReqeust>
			<City>Mumbai</City>
			<State>MH</State>
		</esb:getAddressResponse>

	</xsl:template>
	<xsl:output indent="yes" />
</xsl:stylesheet>