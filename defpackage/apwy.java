package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwy extends aonm implements aooz {
    private static volatile aopf F;
    public static final apwy a;
    public aqwr A;
    public apct B;
    public aqvj C;
    public auna D;
    public aujl E;
    private int G;
    public int b;
    public apdn d;
    public asvu e;
    public apbn f;
    public atij g;
    public apdc h;
    public aotz i;
    public aouw j;
    public atej k;
    public aulu l;
    public atoy m;
    public atax n;
    public atfq o;
    public aqrs p;
    public atck q;
    public asuf r;
    public avui s;
    public astv t;
    public avdj u;
    public atyg v;
    public atoa w;
    public auiv x;
    public aqbb y;
    public apxs z;
    private byte H = 2;
    public String c = "";

    static {
        apwy apwyVar = new apwy();
        a = apwyVar;
        aonm.registerDefaultInstance(apwy.class, apwyVar);
    }

    private apwy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.H);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.H = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001d\u0000\u0002\u0001\ue444귛\u001d\u0000\u0000\u0001\u0001ဈ\u0000\u0004ဉ\u0015\ue948㖈ဉ\u0003\uf69a㻒ဉ\u0004祉㼞ဉ\u0007\uec0f㾐ဉ\t\uee68䀼ဉ\u0005\uf593䁟ᐉ\n\ue4a4䆮ဉ\u0006\ue04c䕮ဉ\f\ue7c6䠑ဉ\u0010\ueb23䡟ဉ\u0011\ueb51䯔ဉ\u0012\ue6c3䳄ဉ\u0013\ue71e䵲ဉ\u0016\ue7b1为ဉ\u0017ﱷ亀ဉ\u0018ﲘ兪ဉ\u001a\ue33d劎ဉ\u001bﾦ塍ဉ\u001d\uf211帧ဉ\u001f\uf519損ဉ \ue779暇ဉ!\ue5eb瓠ဉ#\ue2a9盦ဉ\b\ue1c7齙ဉ%\uefebꕋဉ&\ufaf0ꕋဉ'\ue444귛ဉ(", new Object[]{"b", "G", "c", "q", "d", "e", "h", "j", "f", "k", "g", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "i", "B", "C", "D", "E"});
            case NEW_MUTABLE_INSTANCE:
                return new apwy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = F;
                if (aopfVar == null) {
                    synchronized (apwy.class) {
                        aopfVar = F;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            F = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
