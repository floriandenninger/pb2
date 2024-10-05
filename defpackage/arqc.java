package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqc extends aonm implements aooz {
    public static final arqc a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arqc arqcVar = new arqc();
        a = arqcVar;
        aonm.registerDefaultInstance(arqc.class, arqcVar);
    }

    private arqc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue55e⡇\ued00㋚\u0002\u0000\u0000\u0002\ue55e⡇ᐼ\u0000\ued00㋚ᐼ\u0000", new Object[]{"c", "b", avci.class, arpw.class});
            case NEW_MUTABLE_INSTANCE:
                return new arqc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arqc.class) {
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
