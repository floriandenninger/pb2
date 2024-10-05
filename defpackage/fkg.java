package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fkg extends aonm implements aooz {
    public static final fkg a;
    private static volatile aopf o;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;
    public long l;
    public long m;
    public int n;
    public aoot j = aoot.a;
    public String c = "";
    public boolean k = true;

    static {
        fkg fkgVar = new fkg();
        a = fkgVar;
        aonm.registerDefaultInstance(fkg.class, fkgVar);
    }

    private fkg() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\b2\tဇ\u0007\nဂ\b\u000bဂ\t\fင\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", fkf.a, "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new fkg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (fkg.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
