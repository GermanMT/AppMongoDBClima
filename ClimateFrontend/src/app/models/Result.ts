import { Day } from 'src/app/models/Day';

export class Result{
    queryCost!: number;
    latitude!: number;
    longitude!: number;
    resolvedAddress!: string;
    address!: string;
    timezone!: string;
    tzoffset!: number;
    description!: string;
    days!: Day[];
}
