package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfa extends aonm implements aooz {
    public static final asfa a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfa asfaVar = new asfa();
        a = asfaVar;
        aonm.registerDefaultInstance(asfa.class, asfaVar);
    }

    private asfa() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uefcf⸵\ue1c0ꉹ\u0005\u0000\u0000\u0005\uefcf⸵ᐼ\u0000突ハᐼ\u0000ﭴ㨬ᐼ\u0000\ueb41䣥ᐼ\u0000\ue1c0ꉹᐼ\u0000", new Object[]{"c", "b", atcf.class, aqku.class, arae.class, avhy.class, aqee.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asfa.class) {
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
