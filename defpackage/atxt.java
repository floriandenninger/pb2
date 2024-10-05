package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxt extends aonm implements aooz {
    public static final atxt a;
    private static volatile aopf h;
    public int b;
    public float c;
    public avzh d;
    public boolean e;
    public long f;
    public long g;

    static {
        atxt atxtVar = new atxt();
        a = atxtVar;
        aonm.registerDefaultInstance(atxt.class, atxtVar);
    }

    private atxt() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0005\u0004ဂ\u0006\u0005ဂ\u0007\u0006ဉ\u0002", new Object[]{"b", "c", "e", "f", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atxt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atxt.class) {
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
