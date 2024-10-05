package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfb extends aonm implements aooz {
    private static volatile aopf C;
    public static final asfb a;
    public boolean A;
    public atbc B;
    private aryo D;
    public int b;
    public int c;
    public arnb d;
    public int i;
    public boolean j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public int q;
    public boolean r;
    public asex s;
    public asey u;
    public long v;
    public asen z;
    private byte E = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public aonu o = emptyIntList();
    public String t = "";
    public String w = "";
    public String x = "";
    public String y = "";

    static {
        asfb asfbVar = new asfb();
        a = asfbVar;
        aonm.registerDefaultInstance(asfb.class, asfbVar);
    }

    private asfb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.E);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0002\u00010\u001a\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0006ဈ\u0004\u0007ဋ\u0006\bဈ\u0005\tဇ\b\nဇ\f\u000bᐉ\r\u000f\u0016\u0010ဈ\t\u0018ဇ\u000b\u0019ဇ\n\u001aဇ\u0018\u001cဌ\u001a\u001eဇ\u001b$ဉ\u001f%ဈ 'ဉ\")ဃ#+ဈ%,ဈ&-ဈ'.ဉ(/ဇ)0ဉ*", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "j", "n", "D", "o", "k", "m", "l", "p", "q", apew.k, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B"});
            case NEW_MUTABLE_INSTANCE:
                return new asfb();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = C;
                if (aopfVar == null) {
                    synchronized (asfb.class) {
                        aopfVar = C;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            C = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
