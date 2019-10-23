import React from 'react';
import PropTypes from 'prop-types';

import { Card, CardContent, Typography, CardMedia, ButtonBase } from '@material-ui/core';

import { makeStyles } from '@material-ui/core/styles';

import { Link } from "react-router-dom";

const useStyles = makeStyles({
    card: {
      width: 700,
    },
    media: {
      height: 150,
    },
  });

const CollisionLink = (productCode) => {
    return(React.forwardRef((props, ref) => (
        <Link
        innerRef={ref}
        to={{
            pathname: "/detailedProduct",
            search: `?productCode=${  productCode}`,
        }}
        {...props}
        />
    )));};

const ProductTile = ({productDetails}) => {
    const classes = useStyles();
    return (
        <ButtonBase component={CollisionLink(productDetails.productCode)}>
            <Card className={classes.card}>
                <CardContent>
                    <Typography  gutterBottom variant="h5" component="h2">
                        {productDetails.productName}
                    </Typography>
                    <Typography gutterBottom variant="h6" component="h2">
                        {productDetails.sellerName}
                    </Typography>
                    <Typography  gutterBottom variant="h6" component="h2">
                        {productDetails.productPrice}
                    </Typography>
                    <CardMedia
                    className={classes.media}
                    image= {productDetails.images}
                    title="Product"
                    />
                    <Typography variant="body2" color="textSecondary" component="p">
                        {productDetails.productDescription}
                    </Typography>
                </CardContent>
            </Card>
        </ButtonBase>
    );
};

ProductTile.propTypes = {
    productDetails: PropTypes.shape({
        productCode: PropTypes.string,
        productName: PropTypes.string,
        sellerName: PropTypes.string,
        productPrice: PropTypes.string,
        images: PropTypes.arrayOf(PropTypes.string),
        productDescription: PropTypes.string,
    }),
};

ProductTile.defaultProps = {
    productDetails: undefined,
}

export default ProductTile;
