dataSource {
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings

environments {
  development {
        dataSource {
            pooled = true
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ""
            dbCreate = "create-drop"
        }
    }
    test {
        dataSource {
            pooled = true
            jndiName = "java:/jdbc/GrailsDB"
            dbCreate = "update"
        }
    }
    production {
        dataSource {
            pooled = true
            jndiName = "java:/jdbc/GrailsDB"
            dbCreate = "update"
        }
    }
}
