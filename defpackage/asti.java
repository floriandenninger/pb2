package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asti extends aonm implements aooz {
    public static final asti a;
    private static volatile aopf i;
    public int b;
    public apxf c;
    public boolean d;
    public long f;
    public asth g;
    public boolean h;
    private byte j = 2;
    public int e = 1;

    static {
        asti astiVar = new asti();
        a = astiVar;
        aonm.registerDefaultInstance(asti.class, astiVar);
    }

    private asti() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0006\u0005ဂ\u0005\u0006ဇ\u0003\u0007ဇ\u0007\nဌ\u0004", new Object[]{"b", "c", "g", "f", "d", "h", "e", assi.i});
            case NEW_MUTABLE_INSTANCE:
                return new asti();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (asti.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
