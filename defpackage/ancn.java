package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancn extends aonm implements aooz {
    public static final ancn a;
    private static volatile aopf f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        ancn ancnVar = new ancn();
        a = ancnVar;
        aonm.registerDefaultInstance(ancn.class, ancnVar);
    }

    private ancn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"c", "b", "e", "d", andq.class, ando.class, andp.class});
            case NEW_MUTABLE_INSTANCE:
                return new ancn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ancn.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
