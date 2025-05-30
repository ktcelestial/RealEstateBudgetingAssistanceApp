import React from 'react'
// import { propertiesData } from './data/properties' (example later)

const ListPropertiesComponent = () => {
    // Address Format: [ApptNum] [StreetDoorNum] [StreetName + StreetFullAbrv], [City/Town], [State] [ZipCode] 
    // Estimate needs to auto-populate, perhaps by simple formula
    // If on sale = No, check if rent, sold, other info. etc and update, if yes = availType is Sale
    // If SqftLot, PricePerSqft = 0, show N/A
    const examplePropertiesTest = [
        {
            "id": 1,
            "propertyAddress": "8 Luna Road, Austin, TX 70000",
            "propertyType": "House",
            "propertySubType": "Single Family",
            "PPTonSale": "Yes",
            "PPTavailType": "Sale",
            "PPTprice": 635000,
            "PPTBeds": 4,
            "PPTBath": 3.5,
            "PPTEstimatePerMonth": 4700,
            "PPTsqftSize": 3473,
            "PPTsqftLot": 0.25,
            "PPTYearBuilt": 2016,
            "PricePerSqft": 180
        },
        {
            "id": 2,
            "propertyAddress": "61 Rodeo Drive, Dallas, TX 78001",
            "propertyType": "House",
            "propertySubType": "Single Family",
            "PPTonSale": "No",
            "PPTavailType": "Rent",
            "PPTprice": 2800,
            "PPTBeds": 4,
            "PPTBath": 3,
            "PPTEstimatePerMonth": 2800,
            "PPTsqftSize": 2666,
            "PPTsqftLot": 8276,
            "PPTYearBuilt": 2019,
            "PricePerSqft": 0
        },
        {   
            "id": 3,
            "propertyAddress": "255 Shore Drive, Dallas, TX 78002",
            "propertyType": "House",
            "propertySubType": "Single Family",
            "PPTonSale": "Yes",
            "PPTavailType": "Sale",
            "PPTprice": 849900,
            "PPTBeds": 5,
            "PPTBath": 4,
            "PPTEstimatePerMonth": 6234,
            "PPTsqftSize": 3925,
            "PPTsqftLot": 0.24,
            "PPTYearBuilt": 2003,
            "PricePerSqft": 217
          }
    ]


  return (
    /*
      List of properties, how to display in this case:


    */
    <div>
      <h2> Properties Currently Trending </h2>
      <table className="table table-striped table-bordered">
        <thead>
          <tr>
            <th>Property Address</th>
            <th>Property Type</th>
            <th>Property Sub Type</th>
            <th>Property On Sale</th>
            <th>Property Availability</th>
            <th>Property Price</th>
            <th>Property Beds</th>
            <th>Property Baths</th>
            <th>Property Estimate /mo</th>
            <th>Property Size /sqft</th>
            <th>Property Lot /sqft</th>
            <th>Property Year Built</th>
            <th>Property Price /sqft</th>
          </tr>
        </thead>
        <tbody>
          {examplePropertiesTest.map(property => 
          <tr key={property.id}>
            <td>{property.propertyAddress}</td>
            <td>{property.propertyType}</td>
            <td>{property.propertySubType}</td>
            <td>{property.PPTonSale}</td>
            <td>{property.PPTavailType}</td>
            <td>{"$"+property.PPTprice}</td>
            <td>{property.PPTBeds}</td>
            <td>{property.PPTBath}</td>
            <td>{"$"+property.PPTEstimatePerMonth}</td>
            <td>{property.PPTsqftSize}</td>
            <td>{property.PPTsqftLot}</td>
            <td>{property.PPTYearBuilt}</td>
            <td>{"$"+property.PricePerSqft}</td>
          </tr>)
        }
        </tbody>
      </table>
    </div>
  )
}

export default ListPropertiesComponent