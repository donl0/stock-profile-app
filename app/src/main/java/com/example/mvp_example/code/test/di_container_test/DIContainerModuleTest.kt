import com.example.mvp_example.code.test.backend.model.GeneralPortfolioParamsCorrectTest
import com.example.mvp_example.code.test.backend.model.GeneralPortfolioParamsTest
import org.koin.dsl.module

val testsModel = module{
    single { GeneralPortfolioParamsTest() }
    single { GeneralPortfolioParamsCorrectTest() }
}