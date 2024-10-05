package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augz extends aonm implements aooz {
    private static volatile aopf A;
    public static final augz a;
    public int b;
    public avgg c;
    public avgg d;
    public aulq e;
    public arfs f;
    public aqyg g;
    public aqyg h;
    public float i;
    public aqyg j;
    public aqyg k;
    public aqyg l;
    public aulq m;
    public long n;
    public aulq o;
    public boolean p;
    public apxf q;
    public aulq s;
    public long t;
    public apln u;
    public boolean w;
    public augn x;
    public augx y;
    public boolean z;
    private byte B = 2;
    public aony r = emptyProtobufList();
    public aony v = emptyProtobufList();

    static {
        augz augzVar = new augz();
        a = augzVar;
        aonm.registerDefaultInstance(augz.class, augzVar);
    }

    private augz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0002\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ခ\u0006\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000f\fЛ\rᐉ\u0010\u000eဂ\u0011\u000fဉ\u0012\u0010Л\u0011ဇ\u0013\u0012ᐉ\u000b\u0014ဉ\u0015\u0015ဉ\u0016\u0018ဇ\u0018\u0019ᐉ\r\u001aဂ\f\u001bဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "q", "r", apxf.class, "s", "t", "u", "v", apxf.class, "w", "m", "x", "y", "z", "o", "n", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new augz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (augz.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
