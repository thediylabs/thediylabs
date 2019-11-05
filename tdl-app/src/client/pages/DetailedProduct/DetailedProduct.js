import React from 'react';

const DetailedProduct = () => {
    const params = new URLSearchParams(window.location.search);
    const productCode = params.get('productCode');
    return (
        <div>
            <p>
                {`product code: ${productCode}`}
            </p>
        </div>
    );
};

export default DetailedProduct;
