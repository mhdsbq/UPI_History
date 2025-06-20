import com.upihistory.data.model.Bank
import com.upihistory.data.model.TransactionType
import com.upihistory.data.model.UpiTransaction

var dummyTransactions = listOf(
    UpiTransaction().apply {
        amount = 70916
        timestamp = 1717752600000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Blue Tokai"
        senderVpa = "aadhya@okaxis"
        receiverVpa = "bluetokai@ibl"
        transactionId = "TXN29897544"
    },
    UpiTransaction().apply {
        amount = 4399
        timestamp = 1718335560000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "City Optics"
        senderVpa = "arjun@upi"
        receiverVpa = "cityoptics@okicici"
        transactionId = "TXN55056852"
    },
    UpiTransaction().apply {
        amount = 27548
        timestamp = 1719526140000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Ira"
        receiverName = "The Tea House"
        senderVpa = "ira@upi"
        receiverVpa = "theteahouse@okicici"
        transactionId = "TXN90497292"
    },
    UpiTransaction().apply {
        amount = 5041
        timestamp = 1718012340000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Krishna"
        receiverName = "Chai Point"
        senderVpa = "krishna@upi"
        receiverVpa = "chaipoint@oksbi"
        transactionId = "TXN93676960"
    },
    UpiTransaction().apply {
        amount = 18732
        timestamp = 1719260580000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Local Kirana"
        senderVpa = "arjun@ibl"
        receiverVpa = "localkirana@oksbi"
        transactionId = "TXN70751378"
    },
    UpiTransaction().apply {
        amount = 24185
        timestamp = 1718599800000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Local Kirana"
        senderVpa = "arjun@okaxis"
        receiverVpa = "localkirana@ybl"
        transactionId = "TXN36713088"
    },
    UpiTransaction().apply {
        amount = 20852
        timestamp = 1718700660000
        bank = Bank.HDFC
        transactionType = TransactionType.CREDIT
        senderName = "Kiara"
        receiverName = "Reyansh"
        senderVpa = "kiara@okaxis"
        receiverVpa = "reyansh@ibl"
        transactionId = "TXN85082621"
    },
    UpiTransaction().apply {
        amount = 959
        timestamp = 1718602500000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Ayaan"
        receiverName = "Local Kirana"
        senderVpa = "ayaan@ibl"
        receiverVpa = "localkirana@okicici"
        transactionId = "TXN51037982"
    },
    UpiTransaction().apply {
        amount = 12453
        timestamp = 1718058480000
        bank = Bank.PNB
        transactionType = TransactionType.CREDIT
        senderName = "Ishaan"
        receiverName = "Vihaan"
        senderVpa = "ishaan@oksbi"
        receiverVpa = "vihaan@oksbi"
        transactionId = "TXN76817788"
    },
    UpiTransaction().apply {
        amount = 72599
        timestamp = 1718217480000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Kiara"
        receiverName = "Juice Junction"
        senderVpa = "kiara@ybl"
        receiverVpa = "juicejunction@ybl"
        transactionId = "TXN98922453"
    },
    UpiTransaction().apply {
        amount = 30182
        timestamp = 1718799540000
        bank = Bank.HDFC
        transactionType = TransactionType.CREDIT
        senderName = "Diya"
        receiverName = "Aditya"
        senderVpa = "diya@okicici"
        receiverVpa = "aditya@upi"
        transactionId = "TXN28551689"
    },
    UpiTransaction().apply {
        amount = 31955
        timestamp = 1719626400000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.CREDIT
        senderName = "Krishna"
        receiverName = "Kiara"
        senderVpa = "krishna@ibl"
        receiverVpa = "kiara@okaxis"
        transactionId = "TXN93655836"
    },
    UpiTransaction().apply {
        amount = 47601
        timestamp = 1719346140000
        bank = Bank.SBI
        transactionType = TransactionType.CREDIT
        senderName = "Reyansh"
        receiverName = "Aarav"
        senderVpa = "reyansh@okaxis"
        receiverVpa = "aarav@okaxis"
        transactionId = "TXN14391716"
    },
    UpiTransaction().apply {
        amount = 64582
        timestamp = 1717742460000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Anika"
        receiverName = "Veggie Basket"
        senderVpa = "anika@ybl"
        receiverVpa = "veggiebasket@okhdfcbank"
        transactionId = "TXN63766609"
    },
    UpiTransaction().apply {
        amount = 99468
        timestamp = 1719476100000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Ayaan"
        receiverName = "Fresh Mart"
        senderVpa = "ayaan@ybl"
        receiverVpa = "freshmart@oksbi"
        transactionId = "TXN22000434"
    },
    UpiTransaction().apply {
        amount = 1965
        timestamp = 1717227720000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Diya"
        receiverName = "Green Grocers"
        senderVpa = "diya@ibl"
        receiverVpa = "greengrocers@ybl"
        transactionId = "TXN29331620"
    },
    UpiTransaction().apply {
        amount = 64204
        timestamp = 1719607140000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Juice Junction"
        senderVpa = "arjun@okaxis"
        receiverVpa = "juicejunction@okhdfcbank"
        transactionId = "TXN83552949"
    },
    UpiTransaction().apply {
        amount = 44193
        timestamp = 1719252060000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Saanvi"
        receiverName = "Fresh Mart"
        senderVpa = "saanvi@upi"
        receiverVpa = "freshmart@okicici"
        transactionId = "TXN54454088"
    },
    UpiTransaction().apply {
        amount = 40431
        timestamp = 1719613260000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Krishna"
        receiverName = "Local Kirana"
        senderVpa = "krishna@okicici"
        receiverVpa = "localkirana@upi"
        transactionId = "TXN29917417"
    },
    UpiTransaction().apply {
        amount = 44967
        timestamp = 1718273100000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Desi Cafe"
        senderVpa = "aadhya@okicici"
        receiverVpa = "desicafe@ybl"
        transactionId = "TXN32280932"
    },
    UpiTransaction().apply {
        amount = 61181
        timestamp = 1718309580000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Local Kirana"
        senderVpa = "meera@ybl"
        receiverVpa = "localkirana@okhdfcbank"
        transactionId = "TXN36205341"
    },
    UpiTransaction().apply {
        amount = 45254
        timestamp = 1718732160000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Sai"
        receiverName = "Street Snacks"
        senderVpa = "sai@okicici"
        receiverVpa = "streetsnacks@ybl"
        transactionId = "TXN30388453"
    },
    UpiTransaction().apply {
        amount = 7249
        timestamp = 1718681820000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "City Optics"
        senderVpa = "aadhya@okaxis"
        receiverVpa = "cityoptics@okhdfcbank"
        transactionId = "TXN82033098"
    },
    UpiTransaction().apply {
        amount = 53522
        timestamp = 1718534820000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Ira"
        receiverName = "Street Snacks"
        senderVpa = "ira@ybl"
        receiverVpa = "streetsnacks@oksbi"
        transactionId = "TXN44580614"
    },
    UpiTransaction().apply {
        amount = 11905
        timestamp = 1719675540000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Reyansh"
        receiverName = "Street Snacks"
        senderVpa = "reyansh@upi"
        receiverVpa = "streetsnacks@oksbi"
        transactionId = "TXN63687316"
    },
    UpiTransaction().apply {
        amount = 70740
        timestamp = 1717510920000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Veggie Basket"
        senderVpa = "ishaan@okaxis"
        receiverVpa = "veggiebasket@okaxis"
        transactionId = "TXN76669778"
    },
    UpiTransaction().apply {
        amount = 71673
        timestamp = 1718559900000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Veggie Basket"
        senderVpa = "meera@okhdfcbank"
        receiverVpa = "veggiebasket@okicici"
        transactionId = "TXN84674015"
    },
    UpiTransaction().apply {
        amount = 39101
        timestamp = 1719009900000
        bank = Bank.ICICI
        transactionType = TransactionType.CREDIT
        senderName = "Krishna"
        receiverName = "Ayaan"
        senderVpa = "krishna@okaxis"
        receiverVpa = "ayaan@ibl"
        transactionId = "TXN50984734"
    },
    UpiTransaction().apply {
        amount = 47262
        timestamp = 1719549360000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Sai"
        receiverName = "Sweet Treats"
        senderVpa = "sai@okhdfcbank"
        receiverVpa = "sweettreats@okicici"
        transactionId = "TXN43358876"
    },
    UpiTransaction().apply {
        amount = 40546
        timestamp = 1718511480000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Vivaan"
        receiverName = "Local Kirana"
        senderVpa = "vivaan@okicici"
        receiverVpa = "localkirana@ibl"
        transactionId = "TXN60440233"
    },
    UpiTransaction().apply {
        amount = 82860
        timestamp = 1718996040000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Kiara"
        receiverName = "Sweet Treats"
        senderVpa = "kiara@oksbi"
        receiverVpa = "sweettreats@okicici"
        transactionId = "TXN81348688"
    },
    UpiTransaction().apply {
        amount = 51351
        timestamp = 1717664100000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Chai Point"
        senderVpa = "ananya@okaxis"
        receiverVpa = "chaipoint@upi"
        transactionId = "TXN16838946"
    },
    UpiTransaction().apply {
        amount = 38157
        timestamp = 1718355900000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Quick Laundry"
        senderVpa = "arjun@okhdfcbank"
        receiverVpa = "quicklaundry@oksbi"
        transactionId = "TXN59071899"
    },
    UpiTransaction().apply {
        amount = 4815
        timestamp = 1718187720000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Anna’s Tiffin"
        senderVpa = "aadhya@okaxis"
        receiverVpa = "annastiffin@okhdfcbank"
        transactionId = "TXN50986473"
    },
    UpiTransaction().apply {
        amount = 7619
        timestamp = 1718115960000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Bangalore Biryani"
        senderVpa = "ishaan@ybl"
        receiverVpa = "bangalorebiryani@upi"
        transactionId = "TXN98090877"
    },
    UpiTransaction().apply {
        amount = 6442
        timestamp = 1718930700000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Cycle Repair"
        senderVpa = "ishaan@okaxis"
        receiverVpa = "cyclerepair@ybl"
        transactionId = "TXN36885613"
    },
    UpiTransaction().apply {
        amount = 10805
        timestamp = 1718320860000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Book Nook"
        senderVpa = "ananya@oksbi"
        receiverVpa = "booknook@upi"
        transactionId = "TXN39424579"
    },
    UpiTransaction().apply {
        amount = 26408
        timestamp = 1717220160000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Aditya"
        receiverName = "Book Nook"
        senderVpa = "aditya@upi"
        receiverVpa = "booknook@okicici"
        transactionId = "TXN49801209"
    },
    UpiTransaction().apply {
        amount = 36196
        timestamp = 1717369260000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Saanvi"
        receiverName = "Cycle Repair"
        senderVpa = "saanvi@oksbi"
        receiverVpa = "cyclerepair@okicici"
        transactionId = "TXN32234271"
    },
    UpiTransaction().apply {
        amount = 84176
        timestamp = 1719665100000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Diya"
        receiverName = "Book Nook"
        senderVpa = "diya@upi"
        receiverVpa = "booknook@upi"
        transactionId = "TXN78641682"
    },
    UpiTransaction().apply {
        amount = 63663
        timestamp = 1718427900000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Green Grocers"
        senderVpa = "vihaan@ibl"
        receiverVpa = "greengrocers@oksbi"
        transactionId = "TXN43381497"
    },
    UpiTransaction().apply {
        amount = 36160
        timestamp = 1719487440000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Bangalore Biryani"
        senderVpa = "ananya@ibl"
        receiverVpa = "bangalorebiryani@okicici"
        transactionId = "TXN38731953"
    },
    UpiTransaction().apply {
        amount = 63798
        timestamp = 1718391780000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Sweet Treats"
        senderVpa = "meera@okicici"
        receiverVpa = "sweettreats@okicici"
        transactionId = "TXN26872298"
    },
    UpiTransaction().apply {
        amount = 64975
        timestamp = 1717608120000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Aarav"
        receiverName = "Book Nook"
        senderVpa = "aarav@okicici"
        receiverVpa = "booknook@ibl"
        transactionId = "TXN90930687"
    },
    UpiTransaction().apply {
        amount = 51144
        timestamp = 1719288540000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Green Grocers"
        senderVpa = "meera@oksbi"
        receiverVpa = "greengrocers@okicici"
        transactionId = "TXN96607134"
    },
    UpiTransaction().apply {
        amount = 89184
        timestamp = 1719647760000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "City Optics"
        senderVpa = "aadhya@okaxis"
        receiverVpa = "cityoptics@upi"
        transactionId = "TXN49481682"
    },
    UpiTransaction().apply {
        amount = 498
        timestamp = 1718608740000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Aditya"
        receiverName = "Cycle Repair"
        senderVpa = "aditya@ybl"
        receiverVpa = "cyclerepair@okicici"
        transactionId = "TXN51405554"
    },
    UpiTransaction().apply {
        amount = 64761
        timestamp = 1718330280000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Sai"
        receiverName = "Quick Laundry"
        senderVpa = "sai@okicici"
        receiverVpa = "quicklaundry@okaxis"
        transactionId = "TXN83527525"
    },
    UpiTransaction().apply {
        amount = 24051
        timestamp = 1718516280000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Reyansh"
        receiverName = "Cycle Repair"
        senderVpa = "reyansh@ibl"
        receiverVpa = "cyclerepair@ybl"
        transactionId = "TXN16296433"
    },
    UpiTransaction().apply {
        amount = 51543
        timestamp = 1718790480000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Cycle Repair"
        senderVpa = "arjun@ibl"
        receiverVpa = "cyclerepair@ibl"
        transactionId = "TXN50559841"
    },
    UpiTransaction().apply {
        amount = 75085
        timestamp = 1718927220000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Anika"
        receiverName = "Quick Laundry"
        senderVpa = "anika@okicici"
        receiverVpa = "quicklaundry@ybl"
        transactionId = "TXN75157881"
    },
    UpiTransaction().apply {
        amount = 35227
        timestamp = 1717327500000
        bank = Bank.PNB
        transactionType = TransactionType.CREDIT
        senderName = "Ayaan"
        receiverName = "Ishaan"
        senderVpa = "ayaan@ybl"
        receiverVpa = "ishaan@okicici"
        transactionId = "TXN20692835"
    },
    UpiTransaction().apply {
        amount = 15946
        timestamp = 1719244380000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Sai"
        receiverName = "Sweet Treats"
        senderVpa = "sai@upi"
        receiverVpa = "sweettreats@ybl"
        transactionId = "TXN92179818"
    },
    UpiTransaction().apply {
        amount = 67366
        timestamp = 1719047700000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Kiara"
        receiverName = "Cycle Repair"
        senderVpa = "kiara@okicici"
        receiverVpa = "cyclerepair@ybl"
        transactionId = "TXN54938456"
    },
    UpiTransaction().apply {
        amount = 54405
        timestamp = 1717543320000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Fresh Mart"
        senderVpa = "meera@okaxis"
        receiverVpa = "freshmart@okicici"
        transactionId = "TXN80591776"
    },
    UpiTransaction().apply {
        amount = 23690
        timestamp = 1717813980000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Desi Cafe"
        senderVpa = "vihaan@okicici"
        receiverVpa = "desicafe@ibl"
        transactionId = "TXN98690867"
    },
    UpiTransaction().apply {
        amount = 52920
        timestamp = 1717679760000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Aarav"
        receiverName = "Bangalore Biryani"
        senderVpa = "aarav@okaxis"
        receiverVpa = "bangalorebiryani@okhdfcbank"
        transactionId = "TXN46947236"
    },
    UpiTransaction().apply {
        amount = 51870
        timestamp = 1719568380000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Arjun"
        receiverName = "Bangalore Biryani"
        senderVpa = "arjun@ibl"
        receiverVpa = "bangalorebiryani@okhdfcbank"
        transactionId = "TXN91144771"
    },
    UpiTransaction().apply {
        amount = 75172
        timestamp = 1719392940000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Krishna"
        receiverName = "Book Nook"
        senderVpa = "krishna@ybl"
        receiverVpa = "booknook@okaxis"
        transactionId = "TXN83844517"
    },
    UpiTransaction().apply {
        amount = 9405
        timestamp = 1719014220000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Saanvi"
        receiverName = "Sweet Treats"
        senderVpa = "saanvi@okaxis"
        receiverVpa = "sweettreats@okicici"
        transactionId = "TXN64775403"
    },
    UpiTransaction().apply {
        amount = 67327
        timestamp = 1719384900000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Reyansh"
        receiverName = "Quick Laundry"
        senderVpa = "reyansh@okaxis"
        receiverVpa = "quicklaundry@upi"
        transactionId = "TXN32389633"
    },
    UpiTransaction().apply {
        amount = 53691
        timestamp = 1718997660000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Smart Recharge"
        senderVpa = "ishaan@okaxis"
        receiverVpa = "smartrecharge@ibl"
        transactionId = "TXN38654107"
    },
    UpiTransaction().apply {
        amount = 3992
        timestamp = 1718172060000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Sai"
        receiverName = "Chai Point"
        senderVpa = "sai@oksbi"
        receiverVpa = "chaipoint@upi"
        transactionId = "TXN99431761"
    },
    UpiTransaction().apply {
        amount = 25244
        timestamp = 1718502060000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Street Snacks"
        senderVpa = "vihaan@ybl"
        receiverVpa = "streetsnacks@okicici"
        transactionId = "TXN21537719"
    },
    UpiTransaction().apply {
        amount = 86200
        timestamp = 1718616300000
        bank = Bank.ICICI
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Quick Laundry"
        senderVpa = "aadhya@oksbi"
        receiverVpa = "quicklaundry@ybl"
        transactionId = "TXN93150287"
    },
    UpiTransaction().apply {
        amount = 67791
        timestamp = 1718677560000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Vivaan"
        receiverName = "Cycle Repair"
        senderVpa = "vivaan@ibl"
        receiverVpa = "cyclerepair@okaxis"
        transactionId = "TXN75143062"
    },
    UpiTransaction().apply {
        amount = 26649
        timestamp = 1718017920000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Krishna"
        receiverName = "Street Snacks"
        senderVpa = "krishna@upi"
        receiverVpa = "streetsnacks@ibl"
        transactionId = "TXN80893638"
    },
    UpiTransaction().apply {
        amount = 80970
        timestamp = 1718339100000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Anika"
        receiverName = "Local Pharmacy"
        senderVpa = "anika@ybl"
        receiverVpa = "localpharmacy@oksbi"
        transactionId = "TXN54173677"
    },
    UpiTransaction().apply {
        amount = 22767
        timestamp = 1717393980000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Ayaan"
        receiverName = "Cycle Repair"
        senderVpa = "ayaan@upi"
        receiverVpa = "cyclerepair@ibl"
        transactionId = "TXN90765330"
    },
    UpiTransaction().apply {
        amount = 44741
        timestamp = 1717572900000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Vivaan"
        receiverName = "Local Kirana"
        senderVpa = "vivaan@okicici"
        receiverVpa = "localkirana@oksbi"
        transactionId = "TXN89319822"
    },
    UpiTransaction().apply {
        amount = 77584
        timestamp = 1719591600000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Vivaan"
        receiverName = "Anna’s Tiffin"
        senderVpa = "vivaan@okicici"
        receiverVpa = "annastiffin@oksbi"
        transactionId = "TXN21261058"
    },
    UpiTransaction().apply {
        amount = 58178
        timestamp = 1719046140000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ayaan"
        receiverName = "The Tea House"
        senderVpa = "ayaan@ibl"
        receiverVpa = "theteahouse@ibl"
        transactionId = "TXN36313251"
    },
    UpiTransaction().apply {
        amount = 13815
        timestamp = 1717810200000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Juice Junction"
        senderVpa = "aadhya@okaxis"
        receiverVpa = "juicejunction@okhdfcbank"
        transactionId = "TXN11110942"
    },
    UpiTransaction().apply {
        amount = 61701
        timestamp = 1717645200000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ayaan"
        receiverName = "Street Snacks"
        senderVpa = "ayaan@okicici"
        receiverVpa = "streetsnacks@okicici"
        transactionId = "TXN81687055"
    },
    UpiTransaction().apply {
        amount = 40052
        timestamp = 1717626420000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Cafe Coffee Day"
        senderVpa = "ishaan@ibl"
        receiverVpa = "cafecoffeeday@okicici"
        transactionId = "TXN15002714"
    },
    UpiTransaction().apply {
        amount = 59787
        timestamp = 1719036420000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Local Kirana"
        senderVpa = "vihaan@oksbi"
        receiverVpa = "localkirana@okicici"
        transactionId = "TXN36083966"
    },
    UpiTransaction().apply {
        amount = 61419
        timestamp = 1717981140000
        bank = Bank.PNB
        transactionType = TransactionType.CREDIT
        senderName = "Ayaan"
        receiverName = "Vihaan"
        senderVpa = "ayaan@ybl"
        receiverVpa = "vihaan@okicici"
        transactionId = "TXN37250934"
    },
    UpiTransaction().apply {
        amount = 90025
        timestamp = 1719073380000
        bank = Bank.ICICI
        transactionType = TransactionType.CREDIT
        senderName = "Arjun"
        receiverName = "Aditya"
        senderVpa = "arjun@okicici"
        receiverVpa = "aditya@ibl"
        transactionId = "TXN82165279"
    },
    UpiTransaction().apply {
        amount = 44585
        timestamp = 1719488160000
        bank = Bank.ICICI
        transactionType = TransactionType.CREDIT
        senderName = "Aditya"
        receiverName = "Ishaan"
        senderVpa = "aditya@oksbi"
        receiverVpa = "ishaan@okaxis"
        transactionId = "TXN71414957"
    },
    UpiTransaction().apply {
        amount = 66524
        timestamp = 1718252820000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Bangalore Biryani"
        senderVpa = "ananya@ybl"
        receiverVpa = "bangalorebiryani@oksbi"
        transactionId = "TXN26010510"
    },
    UpiTransaction().apply {
        amount = 27740
        timestamp = 1717394100000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Cafe Coffee Day"
        senderVpa = "ananya@upi"
        receiverVpa = "cafecoffeeday@okicici"
        transactionId = "TXN96003089"
    },
    UpiTransaction().apply {
        amount = 66836
        timestamp = 1717429920000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Fresh Mart"
        senderVpa = "vihaan@ybl"
        receiverVpa = "freshmart@ibl"
        transactionId = "TXN61634721"
    },
    UpiTransaction().apply {
        amount = 54805
        timestamp = 1718367000000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Aadhya"
        receiverName = "Juice Junction"
        senderVpa = "aadhya@okhdfcbank"
        receiverVpa = "juicejunction@oksbi"
        transactionId = "TXN30815828"
    },
    UpiTransaction().apply {
        amount = 43598
        timestamp = 1717196400000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Vivaan"
        receiverName = "Local Pharmacy"
        senderVpa = "vivaan@ybl"
        receiverVpa = "localpharmacy@okaxis"
        transactionId = "TXN26229018"
    },
    UpiTransaction().apply {
        amount = 19056
        timestamp = 1719733740000
        bank = Bank.PNB
        transactionType = TransactionType.CREDIT
        senderName = "Kiara"
        receiverName = "Anika"
        senderVpa = "kiara@okaxis"
        receiverVpa = "anika@okaxis"
        transactionId = "TXN15814757"
    },
    UpiTransaction().apply {
        amount = 21421
        timestamp = 1718744460000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Fresh Mart"
        senderVpa = "ananya@upi"
        receiverVpa = "freshmart@okhdfcbank"
        transactionId = "TXN87475734"
    },
    UpiTransaction().apply {
        amount = 34170
        timestamp = 1718352900000
        bank = Bank.SBI
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Sweet Treats"
        senderVpa = "ananya@ybl"
        receiverVpa = "sweettreats@okaxis"
        transactionId = "TXN86381964"
    },
    UpiTransaction().apply {
        amount = 46494
        timestamp = 1717342200000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Book Nook"
        senderVpa = "vihaan@ybl"
        receiverVpa = "booknook@ybl"
        transactionId = "TXN41869996"
    },
    UpiTransaction().apply {
        amount = 29978
        timestamp = 1717206420000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Juice Junction"
        senderVpa = "ishaan@okaxis"
        receiverVpa = "juicejunction@okicici"
        transactionId = "TXN72835950"
    },
    UpiTransaction().apply {
        amount = 92221
        timestamp = 1719627120000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Kiara"
        receiverName = "The Tea House"
        senderVpa = "kiara@upi"
        receiverVpa = "theteahouse@okicici"
        transactionId = "TXN58412957"
    },
    UpiTransaction().apply {
        amount = 48095
        timestamp = 1718480460000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Ira"
        receiverName = "Sweet Treats"
        senderVpa = "ira@ibl"
        receiverVpa = "sweettreats@ybl"
        transactionId = "TXN79475350"
    },
    UpiTransaction().apply {
        amount = 47968
        timestamp = 1719735480000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Vihaan"
        receiverName = "Local Kirana"
        senderVpa = "vihaan@ybl"
        receiverVpa = "localkirana@okhdfcbank"
        transactionId = "TXN15340744"
    },
    UpiTransaction().apply {
        amount = 26789
        timestamp = 1719148560000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Reyansh"
        receiverName = "Green Grocers"
        senderVpa = "reyansh@upi"
        receiverVpa = "greengrocers@upi"
        transactionId = "TXN55098186"
    },
    UpiTransaction().apply {
        amount = 37943
        timestamp = 1717625220000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Reyansh"
        receiverName = "Juice Junction"
        senderVpa = "reyansh@okaxis"
        receiverVpa = "juicejunction@upi"
        transactionId = "TXN17529546"
    },
    UpiTransaction().apply {
        amount = 49478
        timestamp = 1719405000000
        bank = Bank.HDFC
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Quick Laundry"
        senderVpa = "ananya@okhdfcbank"
        receiverVpa = "quicklaundry@ibl"
        transactionId = "TXN53713153"
    },
    UpiTransaction().apply {
        amount = 72241
        timestamp = 1718339460000
        bank = Bank.BOI
        transactionType = TransactionType.DEBIT
        senderName = "Meera"
        receiverName = "Blue Tokai"
        senderVpa = "meera@oksbi"
        receiverVpa = "bluetokai@upi"
        transactionId = "TXN11534857"
    },
    UpiTransaction().apply {
        amount = 69791
        timestamp = 1718623740000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Ishaan"
        receiverName = "Blue Tokai"
        senderVpa = "ishaan@oksbi"
        receiverVpa = "bluetokai@okicici"
        transactionId = "TXN51492718"
    },
    UpiTransaction().apply {
        amount = 53723
        timestamp = 1719533340000
        bank = Bank.PNB
        transactionType = TransactionType.DEBIT
        senderName = "Saanvi"
        receiverName = "Cycle Repair"
        senderVpa = "saanvi@oksbi"
        receiverVpa = "cyclerepair@okaxis"
        transactionId = "TXN86992523"
    },
    UpiTransaction().apply {
        amount = 32742
        timestamp = 1717615440000
        bank = Bank.AXIS
        transactionType = TransactionType.DEBIT
        senderName = "Ananya"
        receiverName = "Book Nook"
        senderVpa = "ananya@upi"
        receiverVpa = "booknook@okhdfcbank"
        transactionId = "TXN85019929"
    },
    UpiTransaction().apply {
        amount = 95919
        timestamp = 1717573500000
        bank = Bank.UNKNOWN
        transactionType = TransactionType.DEBIT
        senderName = "Aditya"
        receiverName = "Book Nook"
        senderVpa = "aditya@ybl"
        receiverVpa = "booknook@okicici"
        transactionId = "TXN91100351"
    }
)