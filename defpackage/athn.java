package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athn extends aonm implements aooz {
    public static final athn a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        athn athnVar = new athn();
        a = athnVar;
        aonm.registerDefaultInstance(athn.class, athnVar);
    }

    private athn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000\uec06\u17ef\ue754鶩\u0010\u0000\u0000\u0010\uec06\u17efᐼ\u0000\ue592᯦ᐼ\u0000\uf41eⓄᐼ\u0000\ueb6b⳹ᐼ\u0000\ue1ce㩂ᐼ\u0000\ue81c㽾ᐼ\u0000\ueec1䳄ᐼ\u0000\uf584唧ᐼ\u0000\uf086抵ᐼ\u0000\ue538荟ᐼ\u0000\uf281荟ᐼ\u0000\uf283荟ᐼ\u0000\ue442覓ᐼ\u0000\uee76鴒ᐼ\u0000\ue0d4鴮ᐼ\u0000\ue754鶩ᐼ\u0000", new Object[]{"c", "b", askd.class, atdn.class, aovh.class, apib.class, athm.class, athj.class, avhp.class, aqen.class, aqae.class, appb.class, appa.class, appe.class, apoz.class, avbv.class, aulf.class, audw.class});
            case NEW_MUTABLE_INSTANCE:
                return new athn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (athn.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
