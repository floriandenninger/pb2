package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqw extends aonm implements aooz {
    public static final apqw a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apqw apqwVar = new apqw();
        a = apqwVar;
        aonm.registerDefaultInstance(apqw.class, apqwVar);
    }

    private apqw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue99d\u171d\ue99d\u171d\u0001\u0000\u0000\u0001\ue99d\u171dᐼ\u0000", new Object[]{"c", "b", apqt.class});
            case NEW_MUTABLE_INSTANCE:
                return new apqw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apqw.class) {
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
