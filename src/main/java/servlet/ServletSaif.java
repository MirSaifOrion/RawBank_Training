package main.java.servlet;

import com.dbp.core.api.APIImplementationTypes;
import com.dbp.core.api.factory.BackendDelegateFactory;
import com.dbp.core.api.factory.BusinessDelegateFactory;
import com.dbp.core.api.factory.ResourceFactory;
import com.dbp.core.api.factory.impl.DBPAPIAbstractFactoryImpl;
import com.konylabs.middleware.servlet.IntegrationCustomServlet;
import main.java.mapper.BackendDelegateMapperSaif;
import main.java.mapper.BusinessDelegateMapperSaif;
import main.java.mapper.ResourceMapperSaif;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@IntegrationCustomServlet(servletName = "RawBankSaifServlet", urlPatterns = {
        "RawBankSaifServlet"
})

public class ServletSaif extends HttpServlet {
    private static final long serialVersionUID = 351823373L;

    @Override
    public void init() throws ServletException {
        // Register Resource Delegates
        DBPAPIAbstractFactoryImpl.getInstance().getFactoryInstance(ResourceFactory.class)
                .registerResourceMappings(new ResourceMapperSaif(), APIImplementationTypes.BASE);

        // Register Business Delegates
        DBPAPIAbstractFactoryImpl.getInstance().getFactoryInstance(BusinessDelegateFactory.class)
                .registerBusinessDelegateMappings(new BusinessDelegateMapperSaif(), APIImplementationTypes.BASE);

        // Register Backend Delegates
        DBPAPIAbstractFactoryImpl.getInstance().getFactoryInstance(BackendDelegateFactory.class)
                .registerBackendDelegateMappings(new BackendDelegateMapperSaif(),
                        APIImplementationTypes.BASE);
    }
    @Override
    public void destroy() {
    }
}