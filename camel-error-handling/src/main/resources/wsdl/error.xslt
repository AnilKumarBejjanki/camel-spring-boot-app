<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">

		 <esb:getAddressResponse xmlns:esb="http://esb.training.com/esb_adapter">
         	<message value="Please send valid input address!!!!"/>      
      </esb:getAddressResponse>

	</xsl:template>
</xsl:stylesheet>