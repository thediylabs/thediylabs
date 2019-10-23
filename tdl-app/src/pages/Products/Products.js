import React from 'react';

import { Grid } from '@material-ui/core';

import ProductTile from '../../components/ProductTile';

const exampleData = [
    {
        productCode: '01',
        productName: 'Super Amazing Awsome Cake',
        sellerName: 'Gordon Ramsay',
        productPrice: '$123.45',
        images: 'https://images.immediate.co.uk/production/volatile/sites/2/2019/04/Choc-Fudge-Cake-b2d1909.jpg?quality=45&resize=620,413',
        productDescription: 'This cake is super duper amazing!'
    },
    {
        productCode: '02',
        productName: 'Not So Amazing Cake',
        sellerName: 'El Goron Ramsi',
        productPrice: '$67.89',
        images: 'https://7yearolds.com/wp-content/uploads/2018/11/cake.jpg',
        productDescription: 'This cake is not so amazing...'
    },
];

const Products = () => {
    const params = new URLSearchParams(window.location.search);
    const category = params.get('category');
    return (
        <div>
            <p>
                {category}
            </p>
            <Grid
            container
            spacing={5}
            direction="column"
            alignItems="center"
            justify="center"
            style={{ minHeight: '90vh' }}
            >
                {exampleData.map(detail => (
                    <Grid item>
                        <ProductTile productDetails={detail}/>
                    </Grid>   
                ))}
            </Grid>
        </div>
    );
};

export default Products;
