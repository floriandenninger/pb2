package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owc extends aonm implements aooz {
    public static final owc a;
    private static volatile aopf f;
    public int b;
    public int c;
    public owb d;
    private byte g = 2;
    public String e = "";

    static {
        owc owcVar = new owc();
        a = owcVar;
        aonm.registerDefaultInstance(owc.class, owcVar);
    }

    private owc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0001\u0002င\u0001\u0004ᐉ\u0002\u0006ဈ\u0003", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new owc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (owc.class) {
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
