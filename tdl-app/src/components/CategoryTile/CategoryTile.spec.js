import React from 'react';
import renderer from 'react-test-renderer';

import { MemoryRouter } from 'react-router-dom'

import CategoryTile from './CategoryTile';


describe('CategoryTile', () => {
  it('renders correctly', () => {
    const tree = renderer
      .create(
        <MemoryRouter>
          <CategoryTile />
        </MemoryRouter>
      )
      .toJSON();
    expect(tree).toMatchSnapshot();
  });
});
