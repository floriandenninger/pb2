package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atoy extends aonm implements aooz {
    public static final atoy a;
    private static volatile aopf k;
    public boolean b;
    public aonu c = emptyIntList();
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private int l;
    private int m;

    static {
        atoy atoyVar = new atoy();
        a = atoyVar;
        aonm.registerDefaultInstance(atoy.class, atoyVar);
    }

    private atoy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0002\u0004D\t\u0000\u0001\u0000\u0004ဇ\u0003\u0006\u0016\tင\u0007\u0016ဇ\u0014\u0019ဇ\u0016\u001fဇ\u001f!ဇ!Bဇ=Dဇ?", new Object[]{"l", "m", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atoy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atoy.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
