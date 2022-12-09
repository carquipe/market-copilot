# Market Copilot
## Home Shopping Inventory Management

### Key features
- **[UC1]** Post a product to keep track of what you have at home. _Scan or manual_
- **[UC2]** Delete a product of your home. _Scan or manual_
- **[UC3]** Set expiration dates to remind yourself.
- **[UC4]** Order products directly
- **[UC5]** Create a list of product and their quantities to keep track of what you have at home.
- **[UC6]** Set reminders to purchase products that are running low.
- **[UC7]** Add notes to your products to remind youreslf of the expiration date or the location where you store them
- **[UC8]** Create categories to organize your products into logical groups, such as food, cleaning supplies, and medical supplies
- **[UC8]** Access your inventory from any device with an internet connection.


``` mermaid
flowchart TD;

    uc1((Post a product inside inventory));
    uc2((Put a product inside inventory))
    uc3((Delete product from inventory));
    uc4((Order products directly));
    uc5(((Scan Code Bar)))
    uc6(((Manual Editing)))
    subgraph mandatory;
    mc1((Login in platform))
    end
    subgraph once_logged;
    user --> mc1;
    user --> uc1;
    uc1 --> uc5;
    uc3 --> uc5;
    uc1 --> uc6;
    uc3 --> uc6;
    uc2 --> uc6;
    user --> uc2;
    user --> uc3; 
    system --> uc4;
    end;
```


### Technical Requirements
1. User UI will be accessed through web
2. Code bar scanning will be done from device-camera connected and configured to browser
3. API Structure will be API-REST Structure Framework
4. User Sign-Up and login must be done with Google Account

### Epics
- [X] Core
- [ ] User Platform Authentication & Authorization
- [ ] Products REST
- [ ] Listing UI
- [ ] Dashboards
- [ ] Persistence
- [ ] Scanning bar codes
- [ ] Notificactions and reminders
- [ ] Shopping Platform Integrations


### Tasks
- [X] ~~Core - Initial Readme~~
- [ ] Core - Webapp Project Setup

``` mermaid
gantt
axisFormat %x
section Core
Initial Readme  :done, a1, 2022-12-09, 1d
Webapp Project Setup :active, after a1 , 1d
```