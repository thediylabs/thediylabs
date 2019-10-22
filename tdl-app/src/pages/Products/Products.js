import React from 'react';

import { Grid } from '@material-ui/core';

import ProductTile from '../../components/ProductTile';

const exampleData = [
    {
        name: 'Super Amazing Awsome Cake',
        seller: 'Gordon Ramsay',
        price: '$123.45',
        images: 'https://images.immediate.co.uk/production/volatile/sites/2/2019/04/Choc-Fudge-Cake-b2d1909.jpg?quality=45&resize=620,413',
        description: 'This cake is super duper amazing!'
    },
    {
        name: 'Not So Amazing Cake',
        seller: 'El Goron Ramsi',
        price: '$67.89',
        images: 'https://7yearolds.com/wp-content/uploads/2018/11/cake.jpg',
        description: 'This cake is not so amazing...'
    },
];

const Products = () => {
    return (
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
    );
};

export default Products;
