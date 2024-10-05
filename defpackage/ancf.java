package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancf extends aonm implements aooz {
    public static final ancf a;
    private static volatile aopf h;
    public int b;
    public andp c;
    public andp e;
    public ancq f;
    public ancm g;
    private andp i;
    private byte j = 2;
    public aony d = emptyProtobufList();

    static {
        ancf ancfVar = new ancf();
        a = ancfVar;
        aonm.registerDefaultInstance(ancf.class, ancfVar);
    }

    private ancf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003", new Object[]{"b", "c", "d", ancr.class, "e", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new ancf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (ancf.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
