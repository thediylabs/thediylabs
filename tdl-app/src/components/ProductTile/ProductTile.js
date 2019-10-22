import React from 'react';
import PropTypes from 'prop-types';

import { Card, CardContent, Typography, CardMedia } from '@material-ui/core';

import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    card: {
      width: 700,
    },
    media: {
      height: 150,
    },
  });

const ProductTile = ({productDetails}) => {
    const classes = useStyles();
    return (
        <Card className={classes.card}>
            <CardContent>
                <Typography  gutterBottom variant="h5" component="h2">
                    {productDetails.name}
                </Typography>
                <Typography gutterBottom variant="h6" component="h2">
                    {productDetails.seller}
                </Typography>
                <Typography  gutterBottom variant="h6" component="h2">
                    {productDetails.price}
                </Typography>
                <CardMedia
                className={classes.media}
                image= {productDetails.images}
                title="Product"
                />
                <Typography variant="body2" color="textSecondary" component="p">
                    {productDetails.description}
                </Typography>
            </CardContent>
        </Card>
    );
};

ProductTile.propTypes = {
    productDetails: PropTypes.shape({
        name: PropTypes.string,
        seller: PropTypes.string,
        price: PropTypes.string,
        images: PropTypes.arrayOf(PropTypes.string),
        description: PropTypes.string,
    }),
};

ProductTile.defaultProps = {
    productDetails: undefined,
}

export default ProductTile;
