import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

if (FirstName != '') {
    WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), FirstName)
}

if (LastName != '') {
    WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), LastName)
}

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), Email)

if (Gender == 'Male') {
    WebUI.check(findTestObject('Page_DEMOQA/label_Male'))
} else if (Gender == 'Female') {
    WebUI.check(findTestObject('Page_DEMOQA/label_Female'))
} else if (Gender == 'Others') {
    WebUI.check(findTestObject('Page_DEMOQA/label_Other'))
}

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_userNumber'), varUserNumber.toString())

WebUI.clearText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'), Keys.chord(' '))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth'), DateOfBirth)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects'), 'a')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Music'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address'), 'adaw')

if (State != '') {
    WebUI.click(findTestObject('Page_DEMOQA/div_Select State'))

    WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_NCR'))

    WebUI.click(findTestObject('Page_DEMOQA/div_Select City'))

    WebUI.click(findTestObject('Object Repository/Page_DEMOQA/City_Delhi_Option'))
} else if (State == '') {
    WebUI.verifyElementNotClickable(findTestObject('Page_DEMOQA/Select City - input'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

if (WebUI.waitForElementVisible(findTestObject('Page_DEMOQA/Confirm_TableValuesStudent'), 10)) {
    String ThanksSub = WebUI.getText(findTestObject('Page_DEMOQA/div_Thanks for submitting the form'))

    String IsiTable = WebUI.getText(findTestObject('Page_DEMOQA/Confirm_TableValuesStudent'))

    String fullName = (FirstName + ' ') + LastName

    assert ThanksSub == 'Thanks for submitting the form'

    assert IsiTable.contains(fullName)

    assert IsiTable.contains(Email)

    assert IsiTable.contains(Gender)

    assert IsiTable.contains(varUserNumber)

    assert IsiTable.contains(DateOfBirth)

    if (State != '') {
        assert IsiTable.contains(State)

        assert IsiTable.contains(City)
    }
    
    WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

    WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Close'))
} else {
    WebUI.verifyElementNotPresent(findTestObject('Page_DEMOQA/Confirm_TableValuesStudent'), 0)

    String formClass = WebUI.getAttribute(findTestObject('Page_DEMOQA/form_Regist'), 'class')

    if (formClass.contains('was-validated')) {
        WebUI.comment('Form sudah dalam status validasi (warna merah akan muncul pada field Error)')
    }
}

WebUI.closeBrowser()


