class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		name appStatus: "/appstatus" {
//			view = 'grails'
			view = 'appstatus'
    	}
    	
    	// Hack to redirect documentation pages form 0.50/... to latest/...
    	"/documentation/0.50/$page" (controller: "documentationRedirector", action: "redir1")
    	"/documentation/0.50/$dir/$page" (controller: "documentationRedirector", action: "redir2")

		name home:"/" (view:"/index")
		name about:"/about" (view:"/about")
		name demo:"/demo" (view:"/demo")
		name download:"/download" (view:"/download")
		name documentation:"/docs" (view:"/documentation")
		name gallery:"/gallery" (view:"/gallery")
		name getinvolved:"/get-involved" (view:"/get-involved")
		name sitemap:"/sitemap" (view:"/sitemap")

		name donate:"/donate" (view:"/donate")
		name themes:"/theme-gallery" (view:"/themes")
		name faq:"/faq" (view:"/faq")

		"500"(view:'/error')
	}
}
