package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplk extends aonm implements aooz {
    public static final aplk a;
    private static volatile aopf d;
    public int b;
    public apll c;
    private aplj e;
    private byte f = 2;

    static {
        aplk aplkVar = new aplk();
        a = aplkVar;
        aonm.registerDefaultInstance(aplk.class, aplkVar);
    }

    private aplk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf2a1♋\uf6f4⾞\u0002\u0000\u0000\u0002\uf2a1♋ᐉ\u0000\uf6f4⾞ᐉ\u0001", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aplk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aplk.class) {
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
