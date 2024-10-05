package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class attt extends aonm implements aooz {
    public static final attt a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        attt atttVar = new attt();
        a = atttVar;
        aonm.registerDefaultInstance(attt.class, atttVar);
    }

    private attt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"c", "b", attw.class, attv.class, attu.class, aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new attt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (attt.class) {
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
